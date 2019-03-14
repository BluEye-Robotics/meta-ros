DESCRIPTION = "Rviz plugins for neonavigation package"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "trajectory-tracker-rviz-plugins"

SRC_URI = "https://github.com/at-wat/neonavigation_rviz_plugins-release/archive/release/melodic/neonavigation_rviz_plugins/0.3.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bf6d0080259b697996af4e0452e9d11b"
SRC_URI[sha256sum] = "cbad2827ba6b53772b63bc4121bbe599aadb76c08d05db5cfcc9cfad20fa2595"

S = "${WORKDIR}/neonavigation_rviz_plugins-release-release-melodic-neonavigation_rviz_plugins-0.3.0-0"

inherit catkin
