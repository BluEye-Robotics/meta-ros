DESCRIPTION = "Messages specific to MAV planning, especially polynomial planning."
AUTHOR = "Simon Lynen"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=5f4e9e9dcee74b02aa26af144fe2f0af"

DEPENDS = "cmake-modules libeigen mav-msgs message-generation message-runtime trajectory-msgs geometry-msgs sensor-msgs std-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ethz-asl/mav_comm-release/archive/release/melodic/mav_planning_msgs/3.3.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "49d01739597da94695e4546cb0897969"
SRC_URI[sha256sum] = "54bf3cce82bd9924dc58e2cd95da0314127ef73818f625b56fb687ff0fe694d0"

ROS_SPN = "mav_comm"
S = "${WORKDIR}/mav_comm-release-release-melodic-mav_planning_msgs-3.3.2-0"

inherit catkin
