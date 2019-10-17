DESCRIPTION = "The pilz_msgs package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation moveit-msgs message-runtime moveit-msgs"

RDEPENDS_${PN} = "message-runtime moveit-msgs"

SRC_URI = "https://github.com/PilzDE/pilz_industrial_motion-release/archive/release/melodic/pilz_msgs/0.4.7-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fb1f6069bf767fc86aa49319a836178e"
SRC_URI[sha256sum] = "b7a99bbac5d841f029097f50809219cf94f5282565188485c51c907cf33fb469"

ROS_SPN = "pilz_industrial_motion"
S = "${WORKDIR}/pilz_industrial_motion-release-release-melodic-pilz_msgs-0.4.7-1"

inherit catkin
