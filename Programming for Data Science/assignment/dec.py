import base64
import binascii
import hashlib

encoded_user_id = "IZdpWtPSluY_iS9RiSsbD2e13TFJLp8qWhyD0LuRGUM="

# Add padding to make Base64 decoding valid
def add_padding(encoded_str):
    padding = len(encoded_str) % 4
    if padding > 0:
        encoded_str += "=" * (4 - padding)
    return encoded_str

# 1. Try Base64 decoding
def decode_base64(encoded_str):
    try:
        padded_str = add_padding(encoded_str)
        decoded = base64.urlsafe_b64decode(padded_str).decode("utf-8")
        print("Base64 Decoded (UTF-8):", decoded)
    except Exception as e:
        print("Base64 Decoding (UTF-8) failed:", e)
    try:
        # Try decoding as raw bytes if UTF-8 fails
        decoded = base64.urlsafe_b64decode(padded_str)
        print("Base64 Decoded (Raw Bytes):", decoded)
    except Exception as e:
        print("Base64 Decoding (Raw Bytes) failed:", e)

# 2. Try hex decoding
def decode_hex(encoded_str):
    try:
        decoded = binascii.unhexlify(encoded_str)
        print("Hex Decoded:", decoded)
    except Exception as e:
        print("Hex Decoding failed:", e)

# 3. Check if it's a hashed value (e.g., SHA-256, MD5)
def check_hashes(encoded_str):
    print("Hash Testing:")
    test_data = "test_string"  # Replace with known potential input to hash.
    hashes = {
        "SHA-256": hashlib.sha256(test_data.encode()).hexdigest(),
        "SHA-1": hashlib.sha1(test_data.encode()).hexdigest(),
        "MD5": hashlib.md5(test_data.encode()).hexdigest(),
    }
    for algo, hash_value in hashes.items():
        if hash_value == encoded_str:
            print(f"Matched {algo} hash!")
            return
    print("No hash matches found.")

# Run all decoding methods
print("Decoding Process for:", encoded_user_id)
decode_base64(encoded_user_id)
decode_hex(encoded_user_id)
check_hashes(encoded_user_id)
