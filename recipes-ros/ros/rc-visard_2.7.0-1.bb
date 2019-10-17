DESCRIPTION = "Roboception rc_visard support meta package"
AUTHOR = "Heiko Hirschmueller"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "rc-visard-driver rc-visard-description rc-hand-eye-calibration-client rc-pick-client rc-tagdetect-client rc-roi-manager-gui"

SRC_URI = "https://github.com/roboception-gbp/rc_visard-release/archive/release/melodic/rc_visard/2.7.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bb95ee0cccf175b48bfdc12b00720a91"
SRC_URI[sha256sum] = "195f6856f2b17afbd8b1dfd1e3d2ee212b4c5c33e18a72932b760dfc80030906"

S = "${WORKDIR}/rc_visard-release-release-melodic-rc_visard-2.7.0-1"

inherit catkin
