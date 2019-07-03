DESCRIPTION = "The pilz_msgs package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation moveit-msgs message-runtime moveit-msgs"

RDEPENDS_${PN} = "message-runtime moveit-msgs"

SRC_URI = "https://github.com/PilzDE/pilz_industrial_motion-release/archive/release/melodic/pilz_msgs/0.4.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "75d9d588d646cb08659a33827876eed7"
SRC_URI[sha256sum] = "bc85c9fdcdea489b3cc47987acad090e9139ca791750b58506c4e1b9868d6e91"

ROS_SPN = "pilz_industrial_motion"
S = "${WORKDIR}/pilz_industrial_motion-release-release-melodic-pilz_msgs-0.4.4-1"

inherit catkin
