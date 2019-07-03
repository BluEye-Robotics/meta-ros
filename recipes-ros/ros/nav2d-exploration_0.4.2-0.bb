DESCRIPTION = "This package holds a collection of plugins for the RobotNavigator, that provide different cooperative exploration strategies for a team of mobile robots."
AUTHOR = "Sebastian Kasperski"
SECTION = "devel"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "roscpp tf pluginlib nav2d-navigator geometry-msgs nav-msgs visualization-msgs roscpp tf pluginlib nav2d-navigator geometry-msgs nav-msgs visualization-msgs"

RDEPENDS_${PN} = "roscpp tf pluginlib nav2d-navigator geometry-msgs nav-msgs visualization-msgs"

SRC_URI = "https://github.com/skasperski/navigation_2d-release/archive/release/melodic/nav2d_exploration/0.4.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cdfe8d0036f31dc72b4a2ab9e9cc6bca"
SRC_URI[sha256sum] = "a66a917dec44f5f164671346050a6c578e51625a1afc22e100a4f2e40758e8af"

ROS_SPN = "navigation_2d"
S = "${WORKDIR}/navigation_2d-release-release-melodic-nav2d_exploration-0.4.2-0"

inherit catkin
