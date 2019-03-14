DESCRIPTION = "jsk_interactive"
AUTHOR = "Yusuke Furuta"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "mk rosbuild rospy visualization-msgs actionlib dynamic-tf-publisher geometry-msgs jsk-interactive-marker rospy visualization-msgs actionlib dynamic-tf-publisher geometry-msgs jsk-interactive-marker"

RDEPENDS_${PN} = "rospy visualization-msgs actionlib dynamic-tf-publisher geometry-msgs jsk-interactive-marker"

SRC_URI = "https://github.com/tork-a/jsk_visualization-release/archive/release/melodic/jsk_interactive/2.1.5-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "da8fbd32e207110104d516951280833c"
SRC_URI[sha256sum] = "739be630c6e56f915493551f092539377bfc8a224ddc9952b517e223952af8eb"

ROS_SPN = "jsk_visualization"
S = "${WORKDIR}/jsk_visualization-release-release-melodic-jsk_interactive-2.1.5-0"

inherit catkin
