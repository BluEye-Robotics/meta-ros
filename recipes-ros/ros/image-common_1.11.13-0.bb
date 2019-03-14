DESCRIPTION = "Common code for working with images in ROS."
AUTHOR = "Patrick Mihelich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-calibration-parsers camera-info-manager image-transport polled-camera"

RDEPENDS_${PN} = "camera-calibration-parsers camera-info-manager image-transport polled-camera"

SRC_URI = "https://github.com/ros-gbp/image_common-release/archive/release/melodic/image_common/1.11.13-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7ab00d1a184b5d5cc04cedacc00ac72c"
SRC_URI[sha256sum] = "987bdb08a0bf935d3c657331b79564a3e272f6c4538e5be5d893ab6a13865ede"

S = "${WORKDIR}/image_common-release-release-melodic-image_common-1.11.13-0"

inherit catkin
