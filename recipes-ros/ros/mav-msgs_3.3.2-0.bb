DESCRIPTION = "Package containing messages for communicating with rotary wing MAVs"
AUTHOR = "Simon Lynen"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=5f4e9e9dcee74b02aa26af144fe2f0af"

DEPENDS = "cmake-modules libeigen geometry-msgs message-generation std-msgs trajectory-msgs libeigen geometry-msgs message-runtime std-msgs trajectory-msgs"

RDEPENDS_${PN} = "libeigen geometry-msgs message-runtime std-msgs trajectory-msgs"

SRC_URI = "https://github.com/ethz-asl/mav_comm-release/archive/release/melodic/mav_msgs/3.3.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4fd44d26bf7291538bb78edfb6744bcc"
SRC_URI[sha256sum] = "32087bfaf586c5c054af80c396360bbe6997998cec9f6ac44233020ce9ca4c43"

ROS_SPN = "mav_comm"
S = "${WORKDIR}/mav_comm-release-release-melodic-mav_msgs-3.3.2-0"

inherit catkin
