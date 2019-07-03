DESCRIPTION = "Roboception rc_visard support meta package"
AUTHOR = "Heiko Hirschmueller"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "rc-visard-driver rc-visard-description rc-hand-eye-calibration-client rc-pick-client rc-tagdetect-client"

SRC_URI = "https://github.com/roboception-gbp/rc_visard-release/archive/release/melodic/rc_visard/2.6.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ca65a3861a241038267e024de9ae2849"
SRC_URI[sha256sum] = "8ffdf97924685d80d7e9d5aa95abe5abe312f97c1282bd898571b0a9549394e0"

S = "${WORKDIR}/rc_visard-release-release-melodic-rc_visard-2.6.4-1"

inherit catkin
