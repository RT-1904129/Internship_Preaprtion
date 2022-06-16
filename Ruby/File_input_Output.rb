puts "Enter a value :"
# used to take input
val = gets
puts val

# it is used to create a file object to reading from it we will use sysread
aFile = File.new("input.txt", "r")
if aFile
   content = aFile.sysread(20)
   puts content
else
   puts "Unable to open file!"
end
aFile.close

# sys write methed used to write in file
aFile = File.new("input.txt", "r+")
if aFile
   aFile.syswrite("ABCDEF")
else
   puts "Unable to open file!"
end
aFile.close


File.open("employee.txt","r") do |file|
    # it will read all thing
    puts file.read()
    # it will print one line
    puts file.readline()
    # it will print all lines
    puts file.readlines()
end

# it also doing same thing as upper things
file = File.open("employee.txt","r") 
# it will read all thing
puts file.read()
# it will print one line
puts file.readline()
# it will print all lines
puts file.readlines()
file.close

# it ead the whole lines and array is array where arr[0] is First line and arr[1] is second line
arr = IO.readlines("input.txt")
puts arr[0]
puts arr[1]

File.open("employee.txt","w") do |file|
    # it will writing all thing n sapce bar
    puts file.write("\nOscar,Accounting")
    
end

# it also doing same thing as upper things
file = File.open("employee.txt","w") 
# it will writing all thing in space bar
puts file.write("\nOscar,Accounting")

file.close
