DESCRIPTION = "The smach viewer is a GUI that shows the state of hierarchical SMACH state machines. It can visualize the possible transitions between states, as well as the currently active state and the values of user data that is passed around between states. The smach viewer uses the SMACH debugging interface based on the"
AUTHOR = "Jonathan Bohren"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rostest smach-ros smach-msgs wxpython"

RDEPENDS_${PN} = "smach-ros smach-msgs wxpython"

SRC_URI = "https://github.com/jbohren/executive_smach_visualization-release/archive/release/melodic/smach_viewer/2.0.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5ded98d78fb6a2b3d7c0fb2b648b74d1"
SRC_URI[sha256sum] = "8584bd38b3751fa90a38c2b30e2a4d16882ebfcf49508be583d895856bb0c4e1"

ROS_SPN = "executive_smach_visualization"
S = "${WORKDIR}/executive_smach_visualization-release-release-melodic-smach_viewer-2.0.2-0"

inherit catkin
