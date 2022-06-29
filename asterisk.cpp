//Given a rectangular matrix of characters, add a border of asterisks(*) to it.
#include <iostream>
#include <string>
#include <vector>

std::vector<std::string> solution(std::vector<std::string> picture) {
	std::size_t n = picture.size() + 2;
	std::size_t m = picture[0].size() + 2;
	std::vector<std::string> result(n);
	std::string border = "";

	for (std::size_t i = 0; i < m; ++i)
		border += "*";
	for (std::size_t i = 0; i < n; ++i)
	{
		if (i == 0 || i == n - 1)
			result[i] = border;
		else
			result[i] = "*" + picture[i - 1] + "*";
	}

	return result;

