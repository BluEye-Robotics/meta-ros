DESCRIPTION = "roseus_smach * Euslisp state machine class. it will be moved. * Message publisher for visualizing current state by smach_viewer. * Simple pickle dump script for debugging state machine. * Execute state machine as a action server."
AUTHOR = "Manabu Saito"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roseus rostest std-msgs actionlib smach smach-ros smach-msgs actionlib-tutorials message-generation euslisp std-msgs actionlib roseus rostest smach smach-ros smach-msgs actionlib-tutorials message-runtime"

RDEPENDS_${PN} = "euslisp std-msgs actionlib roseus rostest smach smach-ros smach-msgs actionlib-tutorials message-runtime"

SRC_URI = "https://github.com/tork-a/jsk_roseus-release/archive/release/melodic/roseus_smach/1.7.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1b3b7d4d9274941dcb043e02fd5ac3c0"
SRC_URI[sha256sum] = "d174a427c36c766fcc47ceb18a95cc3dda75a74b04550a7b7d2b8de78af3edde"

ROS_SPN = "jsk_roseus"
S = "${WORKDIR}/jsk_roseus-release-release-melodic-roseus_smach-1.7.4-1"

inherit catkin
