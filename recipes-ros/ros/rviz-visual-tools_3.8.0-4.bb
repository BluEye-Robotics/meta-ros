DESCRIPTION = "Utility functions for displaying and debugging data in Rviz via published markers"
AUTHOR = "Dave Coleman"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " sensor-msgs eigen-conversions geometry-msgs roscpp tf-conversions visualization-msgs graph-msgs std-msgs trajectory-msgs roslint eigen-stl-containers libogre-dev libqt5x11extras5-dev"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/PickNikRobotics/rviz_visual_tools-release/archive/release/melodic/rviz_visual_tools/3.8.0-4.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3d9b78c3d0a02eb9b905ba73e77c3425"
SRC_URI[sha256sum] = "4b4eb5dcac945413442686e3c37cb0f383c40fd7cb491044ca7e0505fffb2976"

S = "${WORKDIR}/rviz_visual_tools-release-release-melodic-rviz_visual_tools-3.8.0-4"

inherit catkin
