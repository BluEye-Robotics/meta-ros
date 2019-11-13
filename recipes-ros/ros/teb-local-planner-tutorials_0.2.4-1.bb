DESCRIPTION = "The teb_local_planner_tutorials package"
AUTHOR = "Christoph Rösmann"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "stage-ros teb-local-planner move-base map-server amcl"

RDEPENDS_${PN} = "stage-ros teb-local-planner move-base map-server amcl"

SRC_URI = "https://github.com/rst-tu-dortmund/teb_local_planner_tutorials-release/archive/release/melodic/teb_local_planner_tutorials/0.2.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4096a23a4cef0837f95c264408548677"
SRC_URI[sha256sum] = "844e431b24ee4635946618da536b22f2571196f298e74b7715ee6a4f4cd42d1a"

S = "${WORKDIR}/teb_local_planner_tutorials-release-release-melodic-teb_local_planner_tutorials-0.2.4-1"

inherit catkin
