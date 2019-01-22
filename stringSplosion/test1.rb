def string_splosion(str)
  str.split("")
    .map
    .with_index{|v,i| str[0..i]}
    .join
end
puts string_splosion("Code")
