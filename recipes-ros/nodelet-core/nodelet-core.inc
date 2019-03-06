SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "44092d0bcf0378a154e10f61128fd5c6"
SRC_URI[sha256sum] = "609a85323a47aff2e5e53531a465ddc62ba3290ba8b359a12dd07253bbaa9e26"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "nodelet_core"
