DESCRIPTION = "Roboception rc_visard support meta package"
AUTHOR = "Heiko Hirschmueller"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "rc-visard-driver rc-visard-description rc-hand-eye-calibration-client"

SRC_URI = "https://github.com/roboception-gbp/rc_visard-release/archive/release/melodic/rc_visard/2.5.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bcdd5a34c14e5c6df044eec3ce95feb2"
SRC_URI[sha256sum] = "94eeab456e9143fa51ff0ad860be0cd10cfb400972cc6eef6f8c757753c12f44"

S = "${WORKDIR}/rc_visard-release-release-melodic-rc_visard-2.5.0-0"

inherit catkin
