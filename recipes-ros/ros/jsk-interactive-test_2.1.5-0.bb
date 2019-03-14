DESCRIPTION = "jsk_interactive_test"
AUTHOR = "Kei Okada"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "mk rosbuild rospy visualization-msgs jsk-interactive jsk-interactive-marker rospy visualization-msgs  jsk-interactive jsk-interactive-marker"

RDEPENDS_${PN} = "rospy visualization-msgs  jsk-interactive jsk-interactive-marker"

SRC_URI = "https://github.com/tork-a/jsk_visualization-release/archive/release/melodic/jsk_interactive_test/2.1.5-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "55ca6bec7123c78e47fc5d1fe60f973b"
SRC_URI[sha256sum] = "5f1a01af87786761626dae0bf1e263553bcdf2e57234cbe55f1273dc523d1104"

ROS_SPN = "jsk_visualization"
S = "${WORKDIR}/jsk_visualization-release-release-melodic-jsk_interactive_test-2.1.5-0"

inherit catkin
