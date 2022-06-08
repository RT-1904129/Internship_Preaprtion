grade = 99

if grade >= 90
    puts "A+"
elsif grade >= 80 && grade <= 89
    puts "A"
else
    puts "B+"
end

i = 0
while i<=10
    puts i
    i+=1
end
puts (1..10).to_a

# we can obsered that if we are using two dots than it is including last end point
# if we put three dots than it will not including last point
# Donot put things close puts unless it will not work
puts (1...10).to_a
puts "\nTesting\n"

for i in (1..10).to_a
    puts i
end


# it similar to switch case in Java and C++

case grade
when 90..100
    puts "A+"
when 80..89
    puts "A"
when 70..79
    puts "B"
else 
    puts "improve"
end

