#Modules are a way of grouping together methods, classes, and constants.

module Mymodule2
    class TestClass
        def initialize
            puts "TecstClass object created"
        end 
        def mymethod
            puts "it is a user defined method"
        end 
    end 
end 

myobject = Mymodule2:: TestClass.new 
myobject.mymethod

# Mixin
module A 
    def a1
        puts " we are in a1 method of Module A"
    end 

    def a2
        puts " We are in a2 method of module A"
    end 
end 

module B 
    def b1 
        puts "we are in b1 method of Module B"
    end

    def b2
        puts "we are in b3 method of module B"
    end 
end 

class Sample 
    include A
    include B 
end 

s = Sample.new 
s.a1
s.a2 

# Modules call in Rubey
module Trig
    PI = 3.141592654
    def Trig.sin(x)
        puts Math.sin(x)
    end
    def Trig.cos(x)
        puts Math.cos(x)
    end
 end

puts Trig::PI
Trig.sin(30)
Trig.cos(30)

#Consider the following module written in support.rb file.
# module Week
#     FIRST_DAY = "Sunday"
#     def Week.weeks_in_month
#        puts "You have four weeks in a month"
#     end
#     def Week.weeks_in_year
#        puts "You have 52 weeks in a year"
#     end
#  end


# #!/usr/bin/ruby
# $LOAD_PATH << '.'
# require "support"

# class Decade
# include Week
#    no_of_yrs = 10
#    def no_of_months
#       puts Week::FIRST_DAY
#       number = 10*12
#       puts number
#    end
# end
# d1 = Decade.new
# puts Week::FIRST_DAY
# Week.weeks_in_month
# Week.weeks_in_year
# d1.no_of_months