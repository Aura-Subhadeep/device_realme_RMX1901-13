# Vendor Tree
echo 'Cloning Vendor tree [1/3]'
git clone https://github.com/Aura-Subhadeep/vendor_realme_RMX1901-13 -b 13 vendor/realme/RMX1901

# Kernel Tree
echo 'Cloning Kernel tree [2/3]'
git clone https://github.com/RMX1901/kernel_realme_RMX1901 -b x.319 kernel/realme/RMX1901

# Use Proton Clang For Compilation
echo ' Cloning Proton Clang For Compilation [3/4]'
git clone --depth=1 https://github.com/kdrag0n/proton-clang.git prebuilts/clang/host/linux-x86/clang-proton

# Qcom-caf sdm845 - media/audio/display
echo ' Cloning caf sdm845 - media/audio/display [4/4]'
rm -rf hardware/qcom-caf/sdm845/audio
rm -rf hardware/qcom-caf/sdm845/media
rm -rf hardware/qcom-caf/sdm845/display
git clone https://github.com/aex-tmp/platform_hardware_qcom_audio.git -b 12.x-caf-sdm845 hardware/qcom-caf/sdm845/audio
git clone https://github.com/aex-tmp/platform_hardware_qcom_media.git -b 12.x-caf-sdm845 hardware/qcom-caf/sdm845/media
git clone https://github.com/aex-tmp/platform_hardware_qcom_display.git -b 12.x-caf-sdm845 hardware/qcom-caf/sdm845/display
