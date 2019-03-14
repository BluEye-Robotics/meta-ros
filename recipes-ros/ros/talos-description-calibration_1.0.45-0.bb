DESCRIPTION = "This package contains the description of the hand-eye calibration of the TALOS robot. The files in this package are used also from the talos_description package."
AUTHOR = ""
SECTION = "devel"
LICENSE = "CC-BY-NC-ND-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=c34cc4dbd73e2cebfa3f363105f53fd5"

DEPENDS = "xacro"

RDEPENDS_${PN} = "xacro"

SRC_URI = "https://github.com/pal-gbp/talos_robot-release/archive/release/melodic/talos_description_calibration/1.0.45-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7a10c211724bbbcffd21e1373777e7d9"
SRC_URI[sha256sum] = "d5e6dc7ae7fcb932718a916c9be6c892b135ff83c5be3795c87cd4b9412f72e0"

ROS_SPN = "talos_robot"
S = "${WORKDIR}/talos_robot-release-release-melodic-talos_description_calibration-1.0.45-0"

inherit catkin
