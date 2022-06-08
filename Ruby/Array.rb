# this is array
# nums =[1,2,3]
# names = [1,"john","jack"]
# puts nums # it will print in vertical directions
# puts "#{nums}" # it will print in horizontal direction

# nums = Array.new([1,2,3])
# nums = Array.new(["Joe","john","jack"])
# puts "#{nums}"

# temp = Array.new(5,"hello")
# temp = Array.new(5,0)
# puts "#{temp}"

# By range operator
# temp = Array(20..30)
# puts "#{temp}"

a = Array.new([10,"hello",40,50])

puts a.size # it will give size
puts a.length # it will give length
puts a.last # it will give last element
puts a.first # it will give first elemnt

# it convert to string
puts a.to_s

# we will doing operation as stack
a.push(60)
a.pop()

a.each_with_index {|vl,idx| puts "The value at index #{idx} is#{vl}"}
a.delete_at(0) # it will delete 0 index number
puts "#{a}" 



