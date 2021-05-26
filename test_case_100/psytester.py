import os
import sys
'''
py verify.py <input-directory-path> <output-directory-path>
'''
indir,outdir=sys.argv[1],sys.argv[2]
allfiles=os.listdir(indir)
tot=0
passed = 0

with open('log.txt','w+') as err:
    for file in allfiles:
        tot+=1
        try:
            with open(os.path.join(outdir,file),'r+') as outp:
                stream = os.popen('java -cp ../classes/ FabricBreakup '+os.path.join(indir,file))
                output = stream.read()
                test = outp.read().replace('\r','')
                print(test==output)
                if output!=test:
                    err.write(file+'------> failed\n')
                    print(file+'-----------> failed\n')
                else:
                 	print(file+'-----------> passed\n')
                 	err.write(file+'------> passed\n')
                 	passed+=1
        except:
            err.write(file+'\n')
    print('Total test cases : ',tot)
    print('Passed cases : ',passed)
    err.write('Total test cases : '+str(tot))
    err.write('Total test cases : '+str(passed))
