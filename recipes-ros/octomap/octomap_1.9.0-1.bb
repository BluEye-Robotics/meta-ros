DESCRIPTION = "The OctoMap library implements a 3D occupancy grid mapping approach, providing data structures and mapping algorithms in C++."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=9b0e1f01a68f441eeaf7b5e18812d3c8"

SRC_URI = "https://github.com/ros-gbp/octomap-release/archive/release/melodic/${ROS_BPN}/${PV}.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "44ce06123a97e3cb90ebd0cf22fbc154"
SRC_URI[sha256sum] = "20a5bb7d159129053c2b25f7c02a76ad4ffec83c31e2fb4486753c88115caee6"

S = "${WORKDIR}/${ROS_SPN}-release-release-melodic-${ROS_BPN}-${PV}"

EXTRA_OECMAKE += "-DCMAKE_SKIP_RPATH=ON"
FILES_${PN} += "/opt/ros/melodic/lib/lib*.so.*"
FILES_${PN}-dev += "/opt/ros/melodic/lib/lib*.so"

inherit catkin
