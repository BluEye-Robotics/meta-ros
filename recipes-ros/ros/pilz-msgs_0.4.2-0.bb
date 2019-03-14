DESCRIPTION = "The pilz_msgs package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "genmsg message-generation moveit-msgs message-runtime moveit-msgs"

RDEPENDS_${PN} = "message-runtime moveit-msgs"

SRC_URI = "https://github.com/PilzDE/pilz_industrial_motion-release/archive/release/melodic/pilz_msgs/0.4.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cc711e5340ff0ab228f0ab84bb9b9f58"
SRC_URI[sha256sum] = "83d399a6e0db26ccb56590b15c3817e8b82da0d5572a0661e3852ed7d689081d"

ROS_SPN = "pilz_industrial_motion"
S = "${WORKDIR}/pilz_industrial_motion-release-release-melodic-pilz_msgs-0.4.2-0"

inherit catkin
