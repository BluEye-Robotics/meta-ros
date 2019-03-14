DESCRIPTION = "Visualization of motion-plans for legged robots. It draws support areas, contact forces and motion trajectories in RVIZ and displays URDFs for specific robots, including a one-legged, a two-legged hopper and"
AUTHOR = "Alexander W. Winkler"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "xpp-states xpp-msgs xpp-vis xpp-hyq xpp-quadrotor xpp-examples"

SRC_URI = "https://github.com/leggedrobotics/xpp-release/archive/release/melodic/xpp/1.0.9-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0c520725e9ea7a4943d4f6fc07802263"
SRC_URI[sha256sum] = "0ae1750672383b8bb426d410df74906f5ba29c01edc81972c331b1a8e27b4061"

S = "${WORKDIR}/xpp-release-release-melodic-xpp-1.0.9-0"

inherit catkin
