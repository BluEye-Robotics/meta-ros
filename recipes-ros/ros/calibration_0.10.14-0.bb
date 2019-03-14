DESCRIPTION = "Provides a toolchain running through the robot calibration process. This involves capturing calibration data, estimating parameters, and then updating the URDF."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "calibration-estimation calibration-launch calibration-msgs image-cb-detector interval-intersection joint-states-settler laser-cb-detector monocam-settler settlerlib"

RDEPENDS_${PN} = "calibration-estimation calibration-launch calibration-msgs image-cb-detector interval-intersection joint-states-settler laser-cb-detector monocam-settler settlerlib"

SRC_URI = "https://github.com/ros-gbp/calibration-release/archive/release/melodic/calibration/0.10.14-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d99d15d854732c35c528cac8799d84a1"
SRC_URI[sha256sum] = "7a248b88469868131a91a2f1894aef35a0012d9027cdf3532e39849f560268d6"

S = "${WORKDIR}/calibration-release-release-melodic-calibration-0.10.14-0"

inherit catkin
