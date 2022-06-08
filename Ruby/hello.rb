# for putting printing in ruby we will use 
# print never give line break.
# Puts give line break
a = 1
b = 2
c = a + b
puts c
puts "Hello World"
puts " hello a + b = c"
puts "the sum of #{a} + #{b} = #{c}"
print" First line"
print "second line"

def add(a,b)
    c= a +b 
    # puts(c)
    return c
end

result = add(2,3)
puts "ram is giving result\n",result 
result = add(2,5)
puts result
x,y,z = 1,2,3
# swap function
a,b = b,a

