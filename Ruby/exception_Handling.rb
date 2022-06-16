begin
    file = open("/unexistant_file")
    if file
       puts "File opened successfully"
    end
 rescue
       file = STDIN
 end
 print file, "==", STDIN, "\n"


lucky_nums = [4,8,15,16,23,42]
begin 
    lucky_nums["dog"]
    # num = 10/0
rescue ZeroDivisionError 
    puts "Division by zero error"
rescue TypeError => e 
    puts e
 end

 # after exection of error rescue ensure will run
 begin
    raise 'A test exception.'
 rescue Exception => e
    puts e.message
    puts e.backtrace.inspect
 # rescue ZeroDivisionError 
 #     puts "Division by zero error"
 ensure
    puts "Ensuring execution"
 end


 # if no error Occur then this will print 

 begin
    # raise 'A test exception.'
    puts "I'm not raising exception"
 rescue Exception => e
    puts e.message
    puts e.backtrace.inspect
 else
    puts "Congratulations-- no errors!"
 ensure
    puts "Ensuring execution"
 end


# output =========
# I'm not raising exception
# Congratulations-- no errors!
# Ensuring execution