import re

print(re.sub(r"(?:^|-)(.)[^-$]*", r"\1", input()))

