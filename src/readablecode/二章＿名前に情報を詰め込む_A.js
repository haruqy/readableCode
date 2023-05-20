// ファイル保存時の一時的に使う変数
tmp = tempfile.NamedTemporaryFile() ;




SaveData(tmp);

// 引数vの２乗の合計を求める関数
var euclidean_norm = function(v) {
	var retval = 0.0;
	for (var i = 0; i < v.length; i += 1)
		retval += v[i] * v[i];
	return Math.sqrt(retval);
};