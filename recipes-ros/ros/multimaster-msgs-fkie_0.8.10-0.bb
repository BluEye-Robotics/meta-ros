DESCRIPTION = "The messages required by multimaster packages."
AUTHOR = "Alexander Tiderko"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs message-runtime std-msgs"

RDEPENDS_${PN} = "message-runtime std-msgs"

SRC_URI = "https://github.com/fkie-release/multimaster_fkie-release/archive/release/melodic/multimaster_msgs_fkie/0.8.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "59739e87ad6d6e2973bd08718859b184"
SRC_URI[sha256sum] = "eaae4c70fbbfac04d781904e426e516d236eb80b33137ada1ade28eeb2355fc2"

ROS_SPN = "multimaster_fkie"
S = "${WORKDIR}/multimaster_fkie-release-release-melodic-multimaster_msgs_fkie-0.8.10-0"

inherit catkin
