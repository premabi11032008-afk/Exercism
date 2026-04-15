class Luhn:
    def __init__(self, card_num):
        digits = [int(c) for c in card_num if c.isdigit()]
        if len(digits) <= 1 or any(c not in " 0123456789" for c in card_num):
            self.valid_luhn = False
            return

        total = 0
        for i, d in enumerate(reversed(digits)):
            if i % 2:
                d = d * 2 - 9 if d * 2 > 9 else d * 2
            total += d

        self.valid_luhn = total % 10 == 0

    def valid(self):
        return self.valid_luhn
