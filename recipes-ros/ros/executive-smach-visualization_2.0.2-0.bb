DESCRIPTION = "This metapackage depends on the SMACH visualization tools."
AUTHOR = "Jonathan Bohren"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "smach-viewer"

RDEPENDS_${PN} = "smach-viewer"

SRC_URI = "https://github.com/jbohren/executive_smach_visualization-release/archive/release/melodic/executive_smach_visualization/2.0.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "077f6d6a3f7edf87dd64c41231da179d"
SRC_URI[sha256sum] = "75b50684f1fcbe42e1b5307402ff4ac6f5b598d2f2ff67acc3c746af9e83b2c8"

S = "${WORKDIR}/executive_smach_visualization-release-release-melodic-executive_smach_visualization-2.0.2-0"

inherit catkin
