# Vendor Tree
echo 'Cloning Vendor tree [1/5]'
git clone git@github.com:ashim-anwar/vendor_realme_RMX1901-13.git -b 13 vendor/realme/RMX1901

# Kernel Tree
echo 'Cloning Kernel tree [2/5]'
git clone git@github.com:RMX1901/kernel_realme_RMX1901.git -b x.319 kernel/realme/RMX1901

# Realme In-Screen Proximity Patch
echo 'Patching Realme In-Screen Proximity [3/5]'
cd frameworks/base && git fetch git@github.com:ashim-anwar/proximity_patch.git 13 && git cherry-pick 415118ebea7a0cc64801f1cf36ca2385674cdb3b && cd ../..

# Use Proton Clang For Compilation
echo ' Cloning Proton Clang For Compilation [4/5]'
git clone --depth=1 https://github.com/kdrag0n/proton-clang.git -b master prebuilts/clang/host/linux-x86/clang-proton

# Inherit Pocket Mode
echo ' Cloning PocketMode [5/5]'
git clone git@github.com:ashim-anwar/packages_apps_PocketMode.git -b 13 packages/apps/PocketMode

