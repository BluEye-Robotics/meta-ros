DESCRIPTION = "Tutorials showing how to call into rviz internals from python scripts."
AUTHOR = "Dave Hershberger"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/visualization_tutorials-release/archive/release/melodic/rviz_python_tutorial/0.10.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "15427e90256e2340171ed4358c00a358"
SRC_URI[sha256sum] = "525f02f83695fda430a40dbb0d980db92744f6782726cc14c1ee731215f6137f"

ROS_SPN = "visualization_tutorials"
S = "${WORKDIR}/visualization_tutorials-release-release-melodic-rviz_python_tutorial-0.10.3-0"

inherit catkin
