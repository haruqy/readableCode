// ファイル保存時の一時的に使う変数
tmp_file = tempfile.NamedTemporaryFile() ;







SaveData(tmp_file);

// 引数vの２乗の合計を求める関数
var euclidean_norm = function(v) {
	var sum_squares = 0.0;
	for (var i = 0; i < v.length; i += 1)
		sum_squares += v[i] * v[i];
	return Math.sqrt(sum_squares);
};

