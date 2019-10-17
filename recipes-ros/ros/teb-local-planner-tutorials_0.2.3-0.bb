DESCRIPTION = "The teb_local_planner_tutorials package"
AUTHOR = "Christoph Rösmann"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "stage-ros teb-local-planner move-base map-server amcl"

RDEPENDS_${PN} = "stage-ros teb-local-planner move-base map-server amcl"

SRC_URI = "https://github.com/rst-tu-dortmund/teb_local_planner_tutorials-release/archive/release/melodic/teb_local_planner_tutorials/0.2.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8a0971930fc8c6d1d92428931b271ee0"
SRC_URI[sha256sum] = "0a565d87f210b89666efd8a62608439a79462561b64a5fa731756ec5af290b37"

S = "${WORKDIR}/teb_local_planner_tutorials-release-release-melodic-teb_local_planner_tutorials-0.2.3-0"

inherit catkin
