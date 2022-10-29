# Vendor Tree
echo 'Cloning Vendor tree [1/4]'
git clone git@github.com:ashim-anwar/vendor_realme_RMX1901.git -b 13 vendor/realme/RMX1901

# Kernel Tree
echo 'Cloning Kernel tree [2/4]'
git clone git@github.com:ashim-anwar/kernel_realme_RMX1901.git -b x.319 kernel/realme/RMX1901

# Realme In-Screen Proximity Patch
echo 'Patching Realme In-Screen Proximity [3/4]'
cd frameworks/base && git fetch git@github.com:ashim-anwar/proximity_patch.git 13 && git cherry-pick 516173c637ec14b264eb43c0970284c00f2fc4b1 && cd ../..

# Use Proton Clang For Compilation
echo ' Using Proton Clang For Compilation [4/4]'
git clone --depth=1 https://github.com/kdrag0n/proton-clang.git prebuilts/clang/host/linux-x86/clang-proton
