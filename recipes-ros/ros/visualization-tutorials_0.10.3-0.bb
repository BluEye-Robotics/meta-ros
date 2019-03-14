DESCRIPTION = "Metapackage referencing tutorials related to rviz and visualization."
AUTHOR = "Dave Hershberger"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "interactive-marker-tutorials librviz-tutorial rviz-plugin-tutorials rviz-python-tutorial visualization-marker-tutorials"

RDEPENDS_${PN} = "interactive-marker-tutorials librviz-tutorial rviz-plugin-tutorials rviz-python-tutorial visualization-marker-tutorials"

SRC_URI = "https://github.com/ros-gbp/visualization_tutorials-release/archive/release/melodic/visualization_tutorials/0.10.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "eaee57f12237e51248b4c71bbf34244f"
SRC_URI[sha256sum] = "5f67b564a5f87b4d7113b97de74e987a956d3985dac7639204b4ba697a056007"

S = "${WORKDIR}/visualization_tutorials-release-release-melodic-visualization_tutorials-0.10.3-0"

inherit catkin
