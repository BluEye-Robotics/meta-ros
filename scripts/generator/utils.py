import urllib.request
import hashlib

def get_checksums_from_url(url):
    print(url)
    data = urllib.request.urlopen(url).read()
    md5sum = hashlib.md5()
    md5sum.update(data)
    md5sum_hex = md5sum.hexdigest()
    sha256sum = hashlib.sha256()
    sha256sum.update(data)
    sha256sum_hex = sha256sum.hexdigest()
    return md5sum_hex, sha256sum_hex


def print_err(text):
    pre = '\033[91m'
    post = '\033[0m'
    print(pre + text + post)


def print_ok(text):
    pre = '\033[92m'
    post = '\033[0m'
    print(pre + text + post)
