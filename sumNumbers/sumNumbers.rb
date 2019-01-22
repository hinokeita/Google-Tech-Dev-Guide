def sumNumbers(str)
  str.gsub(/[^0-9]/," ")
     .split(" ")
     .compact
     .reject(&:empty?)
     .sum{|v| v.to_i}
end

puts sumNumbers("abc123xyz")
puts sumNumbers("aa11b33")
puts sumNumbers("7 11")
puts sumNumbers("Chocolate")
