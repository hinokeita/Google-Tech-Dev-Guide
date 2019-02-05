# 要件
# 各記号の意味。9:爆弾、-:未オープン、1~8:隣接する爆弾の数

# 追加する機能
# ・入力されたときに2桁の数値になっているかチェック
# ・開けたときに0だったら連鎖していく機能

class MineSweeper
  attr_reader   :height, :weight, :x, :y
  attr_accessor :internal_ban, :view_ban

  def initialize
    @internal_ban = Array.new(10){ Array.new(10,0) }
    @view_ban = Array.new(10){ Array.new(10,0) }
    10.times do
      init_bomb
      set_hint
    end
  end

  def open(input)
    @x,@y = input.split("")
    if bomb?
      puts "残念でした"
      exit
    elsif zero?
      view_ban[x.to_i][y.to_i] = "-"
    else
      view_ban[x.to_i][y.to_i] = internal_ban[x.to_i][y.to_i]
    end
  end

  def complite?
    lists = view_ban.flatten.select{|item| item == 0}
    if lists.empty?
      puts "あなたの勝利です"
      exit
    end
  end

  def bomb?
    internal_ban[x.to_i][y.to_i] == 9
  end

  def zero?
    internal_ban[x.to_i][y.to_i].zero?
  end

  def print_ban
    puts " |0123456789"
    puts " -----------"
    temp = view_ban.map.with_index do |v,i|
      i.to_s << "|" << v.join.to_s
    end
    puts temp
  end

  def init_bomb
    @height = self.rand
    @weight = self.rand
    internal_ban[height][weight] = 9
  end

  def set_hint
    internal_ban[height + 1][weight] += 1     unless internal_ban[height + 1][weight] == 9
    internal_ban[height - 1][weight] += 1     unless internal_ban[height - 1][weight] == 9
    internal_ban[height][weight + 1] += 1     unless internal_ban[height][weight + 1] == 9
    internal_ban[height][weight - 1] += 1     unless internal_ban[height][weight - 1] == 9
    internal_ban[height + 1][weight + 1] += 1 unless internal_ban[height + 1][weight + 1] == 9
    internal_ban[height - 1][weight - 1] += 1 unless internal_ban[height - 1][weight - 1] == 9
    internal_ban[height + 1][weight - 1] += 1 unless internal_ban[height + 1][weight - 1] == 9
    internal_ban[height - 1][weight + 1] += 1 unless internal_ban[height - 1][weight + 1] == 9
  end

  def rand
    Random.rand(1..8).to_i
  end

  def debug
    temp = internal_ban.map do |v|
      v.join
    end
    puts "-------------デバッグ用----------------"
    puts temp
    puts "--------------------------------------"
  end

end

mine = MineSweeper.new
begin
  mine.complite?
  mine.print_ban
  mine.debug
  puts "openする場所を2桁の数値で入力してください(縦横)"
end while mine.open(gets.chomp!)
