DIGIT_MAP = {
    " _ | ||_|   ": "0",
    "     |  |   ": "1",
    " _  _||_    ": "2",
    " _  _| _|   ": "3",
    "   |_|  |   ": "4",
    " _ |_  _|   ": "5",
    " _ |_ |_|   ": "6",
    " _   |  |   ": "7",
    " _ |_||_|   ": "8",
    " _ |_| _|   ": "9",
}


def convert(lines) -> str:
    if len(lines) % 4 != 0:
        raise ValueError("Number of input lines is not a multiple of four")
    if any(len(line) % 3 != 0 for line in lines):
        raise ValueError("Number of input columns is not a multiple of three")

    num_lines = len(lines) // 4
    result_lines = []

    for line_index in range(num_lines):
        segment_lines = lines[line_index*4 : (line_index+1)*4]
        if len(segment_lines) < 4:
            segment_lines += [" " * len(segment_lines[0])] * (4 - len(segment_lines))

        num_digits = len(segment_lines[0]) // 3
        digits = []

        for d in range(num_digits):
            digit_str = ""
            for row in segment_lines:
                digit_str += row[d*3:d*3+3]
            if len(digit_str) < 12:
                digit_str = digit_str.ljust(12)
            digits.append(DIGIT_MAP.get(digit_str, "?"))

        result_lines.append("".join(digits))

    return ",".join(result_lines)

