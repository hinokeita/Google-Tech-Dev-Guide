
# 要件
# 単語の集合(D)の中から単語(S)のサブセットでかつ最も長い単語を検索する。

# 注意
# 単語の文字を含んでいるかだけでなく、文字の並びも考慮する。
# 単語の文字がすべて含まれているか

# アプローチ
# 下記の2段階で処理を行う
# dの単語を1文字ずつ分割し、メタ文字「.*」を含める→空じゃなかったものをlistに格納
# listの中から文字数が長いものを選出

s = "abppplee"
d = ["able","ale","apple","bale","kangaroo"]

d.select! do |v|
  pat = v.chars
         .map{|v2| v2 << ".*"}
         .join
  s.match(pat)
end
puts d.max_by{|item| item.length}
