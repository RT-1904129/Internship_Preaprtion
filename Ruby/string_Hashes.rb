a = "hello world"
b = String.new("hello")
puts a == b 
puts a.length == a.size

# here there is no sunch bracket() is used.

c= [1,2,3]
# when we are checking include both should be same data type
puts a.include?('e')

puts a[0]
puts a[a.length-1] == a[-1]

puts a.upcase
puts a.downcase
puts a.upcase!
puts a

# Hashing key value pair
grades = Hash.new

grades.default = "Improve"
grades[10] = "A+"
grades[9] = "A+"
grades[10] = "A+"

puts grades[7]
puts grades.length
puts grades.size

a = Hash.new
b = Hash.new 
a[0] = 'A'
b[0] = 'A'
puts a == b

# we can conver Hashes into array
puts grades.to_a

x = grades.to_a
puts "#{x}"

puts grades.has_value?(10)
puts grades.has_key?(10)

s = "hello world"
freq = Hash.new
freq.default = 0
s.each_char do |val|
    freq[val] +=1
end 

puts freq

# New way of hashing
hsh = colors = { "red" => 0xf00, "green" => 0x0f0, "blue" => 0x00f }
hsh.each do |key, value|
   print key, " is ", value, "\n"
end

# This is also a way of Hashing
H = Hash["a" => 100, "b" => 200]

puts "#{H['a']}"
puts "#{H['b']}"

(10..15).each do |n| 
    print n, ' ' 
end


# do while like operator
$i = 0
$num = 5
begin
   puts("Inside the loop i = #$i" )
   $i +=1
end while $i < $num

(0..5).each do |i|
    puts "Value of local variable is #{i}"
 end
