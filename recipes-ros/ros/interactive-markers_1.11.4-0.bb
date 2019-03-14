DESCRIPTION = "3D interactive marker communication library for RViz and similar tools."
AUTHOR = "David Gossow"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "rosconsole roscpp rospy rostest std-msgs tf visualization-msgs rosconsole roscpp rospy rostest std-msgs tf visualization-msgs"

RDEPENDS_${PN} = "rosconsole roscpp rospy rostest std-msgs tf visualization-msgs"

SRC_URI = "https://github.com/ros-gbp/interactive_markers-release/archive/release/melodic/interactive_markers/1.11.4-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b9e824d798923997d065c8279855c221"
SRC_URI[sha256sum] = "600001c06acb4e88fe5c9f512476d50b41a795356643bb02e528748b158b81f8"

S = "${WORKDIR}/interactive_markers-release-release-melodic-interactive_markers-1.11.4-0"

inherit catkin
