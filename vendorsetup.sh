# Vendor Tree
echo 'Cloning Vendor tree [1/3]'
git clone git@github.com:ashim-anwar/vendor_realme_RMX1901-12.git -b 12.1 vendor/realme/RMX1901

# Kernel Tree
echo 'Cloning Kernel tree [2/3]'
git clone git@github.com:ashim-anwar/kernel_realme_RMX1901-12.git -b 12.1 kernel/realme/RMX1901

# Realme In-Screen Proximity Patch
echo 'Patching Realme In-Screen Proximity [3/3]'
cd frameworks/base && git fetch git@github.com:ashim-anwar/proximity_patch.git && git cherry-pick 5e8f94a2db8c0a026f72b99c988b0cfdd64716e2 && cd ../..

# Use Proton Clang For Compilation
echo ' Using Proton Clang For Compilation [4/4]'
git clone --depth=1 https://github.com/kdrag0n/proton-clang.git prebuilts/clang/host/linux-x86/clang-proton
