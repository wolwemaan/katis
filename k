ls -1rt bix*| tail -100 |while read ln;do cat "$ln" >> big1; echo "" >> big1; done
ls -1rt bix*| head -n 100 |while read ln;do cat "$ln" >> big2; echo "" >> big2; done
ls -1rt bix*| head -n 200|tail -100 |while read ln;do cat "$ln" >> big3; echo "" >> big3; done
ls -1rt bix*| head -n 300|tail -100 |while read ln;do cat "$ln" >> big4; echo "" >> big4; done
ls -1rt bix*| head -n 400|tail -100 |while read ln;do cat "$ln" >> big5; echo "" >> big5; done
