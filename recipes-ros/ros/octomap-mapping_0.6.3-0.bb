DESCRIPTION = "Mapping tools to be used with the"
AUTHOR = "Armin Hornung"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "octomap-server"

RDEPENDS_${PN} = "octomap-server"

SRC_URI = "https://github.com/ros-gbp/octomap_mapping-release/archive/release/melodic/octomap_mapping/0.6.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4192204aca1af87dd121ab62b7f1ae2b"
SRC_URI[sha256sum] = "4de0af1b402b7e50dd92835c84a45f9ce90467fe3bf16a714d185e6830891b4e"

S = "${WORKDIR}/octomap_mapping-release-release-melodic-octomap_mapping-0.6.3-0"

inherit catkin
